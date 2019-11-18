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

public class ReflectionController implements Initializable{

	@FXML Button Snell,Total,Abbe,Critical,Thin,Calculate;
	@FXML TextField n,lambda,lambda0;
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
				String TempN = n.getText();
				String TempLambda = lambda.getText();
				String TempLambda0 = lambda0.getText();
				String result;
				double Tempresult = 0;
				
				
				if (TempN.isEmpty() && !TempLambda.isEmpty() && !TempLambda0.isEmpty()) {
					Tempresult = Double.parseDouble(TempLambda0)/Double.parseDouble(TempLambda);
					result = "n = " + String.valueOf(Tempresult);
				}
				else if(TempLambda.isEmpty() && !TempLambda0.isEmpty() && !TempN.isEmpty()) {
					Tempresult = Double.parseDouble(TempLambda0)/Double.parseDouble(TempN);
					result = "Lambda = " + String.valueOf(Tempresult);
				}else if(TempLambda0.isEmpty()&& !TempLambda.isEmpty()&& !TempN.isEmpty()) {
					Tempresult = Double.parseDouble(TempLambda)*Double.parseDouble(TempN);
					result = "Lambda0 = " +String.valueOf(Tempresult);
				}else if(TempLambda0.isEmpty() && TempLambda.isEmpty() && TempN.isEmpty()) {
					result = "Parameters empty";
				}else {
					result = "Leave one parameter empty";
				}
				

				
				resu.setText(result);

			}

		});

	}

}
