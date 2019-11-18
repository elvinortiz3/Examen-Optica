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

public class AbbeController implements Initializable{

	@FXML Button Snell,Total,Reflection,Critical,Thin,Calculate;
	@FXML TextField vd,nf,nd,nc;
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
				String Tempvd = vd.getText();
				String Tempnd = nd.getText();
				String Tempnf = nf.getText();
				String Tempnc = nc.getText();
				String result = null;
				double Tempresult = 0;
				
				
				if (Tempvd.isEmpty() && !Tempnf.isEmpty() && !Tempnd.isEmpty() && !Tempnc.isEmpty()) {
					Tempresult = (Double.parseDouble(Tempnd)-1)/(Double.parseDouble(Tempnf)-Double.parseDouble(Tempnc));
					result = "VD = " + String.valueOf(Tempresult);
				}
				else if(Tempnf.isEmpty() && !Tempnd.isEmpty() && !Tempvd.isEmpty() && !Tempnc.isEmpty()) {
					Tempresult = ((Double.parseDouble(Tempnd)-1)/(Double.parseDouble(Tempvd)))+(Double.parseDouble(Tempnc));
					result = "nF = " + String.valueOf(Tempresult);
				}else if(Tempnd.isEmpty()&& !Tempnf.isEmpty()&& !Tempvd.isEmpty() && !Tempnc.isEmpty()) {
					Tempresult = ((Double.parseDouble(Tempnf)-Double.parseDouble(Tempnc))*Double.parseDouble(Tempvd))-1;
					result = "nD = " +String.valueOf(Tempresult);
				}else if (Tempnc.isEmpty()&& !Tempnf.isEmpty()&& !Tempvd.isEmpty() && !Tempnd.isEmpty()) {
					Tempresult = Double.parseDouble(Tempnf)-((Double.parseDouble(Tempnd)-1)/(Double.parseDouble(Tempvd)));
					result = "nC = " +String.valueOf(Tempresult);
				} else if(Tempnd.isEmpty() && Tempnf.isEmpty() && Tempvd.isEmpty() && Tempnc.isEmpty()) {
					result = "Parameters empty";
				}else {
					result = "Leave one parameter empty";
				}
				

				
				resu.setText(result);

			}

		});

				
		
		

	}

}
