package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ThinController implements Initializable{

	@FXML Button Snell,Total,Abbe,Critical,Reflection,Calculate;
	@FXML TextField d0,d1,f;
	@FXML private Text resu;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

		Snell.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				if(event.getClickCount()==1) {

					try {
						FXMLLoader f = new FXMLLoader(this.getClass().getResource("/application/Snell.fxml"));
						Stage stage = (Stage) Snell.getScene().getWindow();
						//Scene scene = new Scene(f.load());
						Scene s = new Scene(f.load());
						stage.setScene(s);
						stage.show();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}


				}

			}

		});

		Total.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				if(event.getClickCount()==1) {

					try {
						FXMLLoader f = new FXMLLoader(this.getClass().getResource("/application/Total.fxml"));
						Stage stage = (Stage) Total.getScene().getWindow();
						//Scene scene = new Scene(f.load());
						Scene s = new Scene(f.load());
						stage.setScene(s);
						stage.show();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}


				}

			}

		});
		Abbe.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				if(event.getClickCount()==1) {

					try {
						FXMLLoader f = new FXMLLoader(this.getClass().getResource("/application/Abbe.fxml"));
						Stage stage = (Stage) Abbe.getScene().getWindow();
						//Scene scene = new Scene(f.load());
						Scene s = new Scene(f.load());
						stage.setScene(s);
						stage.show();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}


				}

			}

		});
		Critical.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				if(event.getClickCount()==1) {

					try {
						FXMLLoader f = new FXMLLoader(this.getClass().getResource("/application/Critical.fxml"));
						Stage stage = (Stage) Critical.getScene().getWindow();
						//Scene scene = new Scene(f.load());
						Scene s = new Scene(f.load());
						stage.setScene(s);
						stage.show();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}


				}

			}

		});
		
		Reflection.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				if(event.getClickCount()==1) {

					try {
						FXMLLoader f = new FXMLLoader(this.getClass().getResource("/application/Reflection.fxml"));
						Stage stage = (Stage) Reflection.getScene().getWindow();
						//Scene scene = new Scene(f.load());
						Scene s = new Scene(f.load());
						stage.setScene(s);
						stage.show();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}


				}

			}

		});
		
		
		Calculate.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				String Tempd0 = d0.getText();
				String Tempd1 = d1.getText();
				String Tempf = f.getText();
				String result;
				
				double Tempresult = 0;
				
				
				if (Tempd0.isEmpty() && !Tempd1.isEmpty() && !Tempf.isEmpty()) {
					Tempresult = (Double.parseDouble(Tempd1)*Double.parseDouble(Tempf))/(Double.parseDouble(Tempd1)-Double.parseDouble(Tempf));
					result = "d0 = " + String.valueOf(Tempresult);
				}
				else if(Tempd1.isEmpty() && !Tempf.isEmpty() && !Tempd0.isEmpty()) {
					Tempresult = (Double.parseDouble(Tempd0)*Double.parseDouble(Tempf))/(Double.parseDouble(Tempd0)-Double.parseDouble(Tempf));
					result = "d1 = " + String.valueOf(Tempresult);
				}else if(Tempf.isEmpty()&& !Tempd1.isEmpty()&& !Tempd0.isEmpty()) {
					Tempresult = (Double.parseDouble(Tempd0)*Double.parseDouble(Tempd1))/(Double.parseDouble(Tempd0)+Double.parseDouble(Tempd1));
					result = "f = " +String.valueOf(Tempresult);
				}else if(Tempf.isEmpty() && Tempd1.isEmpty() && Tempd0.isEmpty()) {
					result = "Parameters empty";
				}else {
					result = "Leave one parameter empty";
				}
				

				
				resu.setText(result);

			}

		});


		
		
				
		
		

	}

}
