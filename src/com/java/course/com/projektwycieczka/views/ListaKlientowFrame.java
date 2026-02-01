package com.java.course.com.projektwycieczka.views;

import com.java.course.com.projektwycieczka.model.RegisteredCustomer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaKlientowFrame extends JFrame {

    private final DefaultListModel<String> model = new DefaultListModel<>();
    private final List<RegisteredCustomer> klienci;
    private final JList<String> list = new JList<>(model);

    public ListaKlientowFrame(List<RegisteredCustomer> klienci) {
        this.klienci = new ArrayList<>(klienci);

        setTitle("Lista Zarejestrowanych Klientów");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        refreshList();

        JScrollPane scrollPane = new JScrollPane(list);

        JPanel formPanel = new JPanel(new GridLayout(7, 2, 5, 5));

        JTextField imieField = new JTextField();
        JTextField nazwiskoField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField telefonField = new JTextField();
        JTextField idField = new JTextField();
        JTextField removeIdField = new JTextField();

        formPanel.add(new JLabel("Imię:"));
        formPanel.add(imieField);
        formPanel.add(new JLabel("Nazwisko:"));
        formPanel.add(nazwiskoField);
        formPanel.add(new JLabel("Email:"));
        formPanel.add(emailField);
        formPanel.add(new JLabel("Telefon:"));
        formPanel.add(telefonField);
        formPanel.add(new JLabel("ID Klienta:"));
        formPanel.add(idField);

        JButton addButton = new JButton("Dodaj klienta");
        addButton.addActionListener(e -> {
            try {
                String imie = imieField.getText().trim();
                String nazwisko = nazwiskoField.getText().trim();
                String email = emailField.getText().trim();
                int telefon = Integer.parseInt(telefonField.getText().trim());
                int id = Integer.parseInt(idField.getText().trim());

                RegisteredCustomer nowy = new RegisteredCustomer(imie, nazwisko, email, telefon, id);
                klienci.add(nowy);
                model.addElement(nowy.getFirstName() + " " + nowy.getLastName() + " (ID: " + nowy.getIDNumber() + ")");

                imieField.setText("");
                nazwiskoField.setText("");
                emailField.setText("");
                telefonField.setText("");
                idField.setText("");

                JOptionPane.showMessageDialog(this, "Dodano nowego klienta!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Błąd danych: " + ex.getMessage(), "Błąd", JOptionPane.ERROR_MESSAGE);
            }
        });

        formPanel.add(new JLabel("ID do usunięcia:"));
        formPanel.add(removeIdField);

        JButton removeButton = new JButton("Usuń klienta");
        removeButton.addActionListener(e -> {
            try {
                int idToRemove = Integer.parseInt(removeIdField.getText().trim());

                boolean removed = false;
                Iterator<RegisteredCustomer> iterator = klienci.iterator();
                int indexToRemove = -1;
                int currentIndex = 0;

                while (iterator.hasNext()) {
                    RegisteredCustomer k = iterator.next();
                    if (k.getIDNumber() == idToRemove) {
                        iterator.remove();
                        indexToRemove = currentIndex;
                        removed = true;
                        break;
                    }
                    currentIndex++;
                }

                if (removed && indexToRemove >= 0) {
                    model.remove(indexToRemove);
                    JOptionPane.showMessageDialog(this, "Usunięto klienta o ID " + idToRemove);
                } else {
                    JOptionPane.showMessageDialog(this, "Nie znaleziono klienta o ID " + idToRemove, "Błąd", JOptionPane.WARNING_MESSAGE);
                }

                removeIdField.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Błędne ID: " + ex.getMessage(), "Błąd", JOptionPane.ERROR_MESSAGE);
            }
        });

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(formPanel, BorderLayout.CENTER);

        JPanel buttonsPanel = new JPanel(new FlowLayout());
        buttonsPanel.add(addButton);
        buttonsPanel.add(removeButton);

        bottomPanel.add(buttonsPanel, BorderLayout.SOUTH);

        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void refreshList() {
        model.clear();
        for (RegisteredCustomer klient : klienci) {
            model.addElement(klient.getFirstName() + " " + klient.getLastName() + " (ID: " + klient.getIDNumber() + ")");
        }
    }

    public static void main(String[] args) {
        List<RegisteredCustomer> klienci = List.of(
                new RegisteredCustomer("Radek", "Blauciak", "r.blauciak@gmail.com", 888666555, 1),
                new RegisteredCustomer("Marek", "Nowak", "m.nowak@gmail.com", 684554333, 125)
        );

        SwingUtilities.invokeLater(() -> new ListaKlientowFrame(klienci).setVisible(true));
    }
}
