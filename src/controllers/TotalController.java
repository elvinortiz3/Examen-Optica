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

public class TotalController implements Initializable{

	@FXML Button Snell,Reflection,Abbe,Critical,Thin,Calculate;
	@FXML TextField n1,n2,r,i;
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
		
		Thin.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				if(event.getClickCount()==1) {

					try {
						FXMLLoader f = new FXMLLoader(this.getClass().getResource("/application/Thin.fxml"));
						Stage stage = (Stage) Thin.getScene().getWindow();
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
				String Tempn1 = n1.getText();
				String Tempn2 = n2.getText();
				String Tempr = r.getText();
				String Tempi = i.getText();
				String result = null;
				double Tempresult = 0;
				
				
				if (Tempn1.isEmpty() && !Tempn2.isEmpty() && !Tempr.isEmpty() && !Tempi.isEmpty()) {
					Tempresult = (Math.sin(Double.parseDouble(Tempr))/Math.sin(Double.parseDouble(Tempi)))*Math.sin(Double.parseDouble(Tempn2));
					result = "n1 = " + String.valueOf(Tempresult);
				}
				else if(Tempn2.isEmpty() && !Tempr.isEmpty() && !Tempn1.isEmpty() && !Tempi.isEmpty()) {
					Tempresult = (Math.sin(Double.parseDouble(Tempi))/Math.sin(Double.parseDouble(Tempr)))*Math.sin(Double.parseDouble(Tempn1));
					result = "n2 = " + String.valueOf(Tempresult);
				}else if(Tempr.isEmpty()&& !Tempn2.isEmpty()&& !Tempn1.isEmpty() && !Tempi.isEmpty()) {
					Tempresult = Math.asin((Math.sin(Double.parseDouble(Tempi))/Double.parseDouble(Tempn2))*Math.sin(Double.parseDouble(Tempn1)));
					result = "r = " +String.valueOf(Tempresult);
				}else if (Tempi.isEmpty()&& !Tempn2.isEmpty()&& !Tempn1.isEmpty() && !Tempr.isEmpty()) {
					Tempresult = Math.asin((Math.sin(Double.parseDouble(Tempr))/Double.parseDouble(Tempn1))*Math.sin(Double.parseDouble(Tempn2)));
					result = "i = " +String.valueOf(Tempresult);
				} else if(Tempr.isEmpty() && Tempn2.isEmpty() && Tempn1.isEmpty() && Tempi.isEmpty()) {
					result = "Parameters empty";
				}else {
					result = "Leave one parameter empty";
				}
				

				
				resu.setText(result);

			}

		});

		
				
		
		

	}

}
