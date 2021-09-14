package com.Arjang;

import com.Arjang.Controller.Controller;
import com.Arjang.Model.Model;
import com.Arjang.View.View;

public class Main {

    public static void main(String[] args) {
	// write your code here
        View v = new View();
        Model m = new Model();
        Controller c = new Controller(m,v);
        c.initController();

    }
}
