package project.uniquindio.cine.app;

import java.awt.EventQueue;
import project.uniquindio.cine.views.ViewMovies;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMovies frame = new ViewMovies();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
