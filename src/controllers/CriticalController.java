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

public class CriticalController implements Initializable{

	@FXML Button Snell,Critic,Total,Abbe,Reflection,Thin,Calculate;
	@FXML TextField n2,n1,angle;
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
				String TempN2 = n2.getText();
				String TempN1 = n1.getText();
				String Angle = angle.getText();
				String result;
				double Tempresult = 0;


				if (TempN2.isEmpty() && !TempN1.isEmpty() && !Angle.isEmpty()) {
					Tempresult = Double.parseDouble(TempN1) * Math.sin(Double.parseDouble(Angle));

					result = "n2 = " + String.valueOf(Tempresult);
				}
				else if(TempN1.isEmpty() && !Angle.isEmpty() && !TempN2.isEmpty()) {
					Tempresult = Double.parseDouble(TempN2) / Math.sin(Double.parseDouble(Angle));
					result = "n1 = " + String.valueOf(Tempresult);
				}else if(Angle.isEmpty()&& !TempN1.isEmpty()&& !TempN2.isEmpty()) {
					Tempresult = Math.toDegrees(Math.asin(Double.parseDouble(TempN2)/Double.parseDouble(TempN1)));
					result = "Angle = " +String.valueOf(Tempresult);
				}else if(Angle.isEmpty() && TempN1.isEmpty() && TempN2.isEmpty()) {
					result = "Parameters empty";
				}else {
					result = "Leave one parameter empty";
				}

				resu.setText(result);
			}


		});






	}

}
