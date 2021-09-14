package com.Arjang.Controller;

import com.Arjang.Model.Model;
import com.Arjang.View.View;

import javax.swing.*;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model m, View v) {
        this.model = m;
        this.view = v;
    }

    public void initController()
    {

        view.getBtnContinue().addActionListener(event -> saveInfo() );
    }

    private void saveInfo() {
        String name = view.getTextUserName().getText();
        String pass = view.getTextPassword().getText();

        model.setFirstName(name);
        model.setLastName(pass);
        JOptionPane.showMessageDialog(null, "UserName: "+name + " , Paaword: " + pass + " , saved on system.!!!");
    }

}
