package TestGUI;

import java.util.ArrayList;

import javafx.geometry.HPos;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Rectangle;

public class MyGridPane extends GridPane {
	

	public MyGridPane(){		
		this.setStyle("-fx-background-color: #FAFBFF;");
		this.getRowConstraints().add(addRow());
		this.getRowConstraints().add(addRow());
		this.getRowConstraints().add(addRow());
	}
	
	public RowConstraints addRow(){
		RowConstraints r = new RowConstraints();
		r.setMaxHeight(50);
		r.setMinHeight(50);
		return r;
	}
	
	public void addColumns(int amountColumns){		
		for(int i=0;i<amountColumns;i++){
			ColumnConstraints c = new ColumnConstraints();
			c.setHalignment(HPos.CENTER);
			c.setMaxWidth(100);
			c.setMinWidth(100);
			Label lab = new Label("Column"+ i);
			this.getColumnConstraints().add(c);
			this.add(lab, i, 0);
		}	
	}
	
	public void addEvent(Rectangle r, int columnIndex, int rowIndex, int colSpan){
		
		this.add(r, columnIndex, rowIndex,colSpan, 1);		
	}
	

}