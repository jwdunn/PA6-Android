package edu.brandeis.memoryGame;

import java.util.Collections;
import java.util.LinkedList;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


/** PA6 android matching game
 * Jared Dunn
 * JBS2011
 * this is my game class that actually creates the game.
 * 
 */
public class Test extends Activity implements OnClickListener {

	CarData level;
	LinkedList<String> MakesModels;
	LinkedList<Car> Cars; 
	int Card= 0; //these two "cards" change after the card is selected
	int Card2 = 0;
	String Make= null;
	String Model = null;
	Car pickedCar = new Car(Make,Model);
	private final View questions[] = new View[6]; //here is an array of questions
	boolean match = false; 
	int numcard; // numcard remembers the spot in the linked list of the selected car.
	int numcard2;
	int win = 0;

	
	public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.main);
	        level= new CarData();
	        Collections.shuffle(MakesModels =level.getMMList());
	    	Cars= level.getCarList();
	        findViews();
	    }
	@Override
	
	// handles when the first card and second card are selected
	public void onClick(View v) {
		switch(v.getId()) {	
		case R.id.card1:
			if(Card!=1){
				Card = 1;
				Make = MakesModels.get(0); //gets the make from the arraylist
				numcard = 0;//remembers the arraylist index position of the card
				((Button) questions[0]).setText(MakesModels.get(0)); //sets the name of the make to the card. in other words it becomes visible
			}
			else if(Card2!=1){
				Card2 = 1;
				Model = MakesModels.get(0);// gets the model from the arraylist
				numcard2 =0; // remembers the index position of the card in the arraylist
				((Button) questions[0]).setText(MakesModels.get(0));// sets the name of the card to visible.
			}
			break;
		case R.id.card2:
			if(Card!=1){
				Card = 1;
				Make = MakesModels.get(1);
				numcard = 1;
				((Button) questions[1]).setText(MakesModels.get(1));
			}
			else if(Card2!=1){
				Card2 = 1;
				Model= MakesModels.get(1);
				numcard2 =1;
				((Button) questions[1]).setText(MakesModels.get(1));
			}
			break;
		case R.id.card3:
			if(Card!=1){
				Card = 1;
				Make = MakesModels.get(2);
				numcard = 2;
				((Button)questions[2]).setText(MakesModels.get(2));
			}
			else if(Card2!=1){
				Card2 = 1;
				Model = MakesModels.get(2);
				numcard2 =2;
				((Button) questions[2]).setText(MakesModels.get(2));
			}
			break;
		case R.id.card4:
			if(Card!=1){
				Card = 1;
				Make = MakesModels.get(3);
				numcard = 3;
				((Button) questions[3]).setText(MakesModels.get(3));
			}
			else if(Card2!=1){
				Card2 = 1;
				Model = MakesModels.get(3);
				numcard2 =3;
				((Button) questions[3]).setText(MakesModels.get(3));
			}
			break;
		case R.id.card5:
			if(Card!=1){
				Card = 1;
				Make = MakesModels.get(4);
				numcard = 4;
				((Button) questions[4]).setText(MakesModels.get(4));
			}
			else if(Card2!=1){
				Card2 = 1;
				Model = MakesModels.get(4);
				numcard2 =4;
				((Button) questions[4]).setText(MakesModels.get(4));
			}
			break;
		case R.id.card6:
			if(Card!=1){
				Card = 1;
				Make = MakesModels.get(5);
				numcard = 5;
				((Button) questions[5]).setText(MakesModels.get(5));
			}
			else if(Card2!=1){
				Card2 = 1;
				Model = MakesModels.get(5);
				numcard2 =5;
				((Button) questions[5]).setText(MakesModels.get(5));
			}
			break;
		}
		
		if (Card == 1 && Card2 ==1 ){
		match = level.Compare(Make, Model);	
			if(match){
				Card = 0;
				Card2 = 0;
				win++;
			}
			else{
				((Button) questions[numcard]).setText("");
				((Button) questions[numcard2]).setText("");
				Card = 0;
				Card2 = 0;
			}
		}
		if(win==3){
			Context context = this;
			String loginPrompt = this.getString(R.string.Win);
			CharSequence text = loginPrompt;
			Toast toast = Toast.makeText(context, text, 1000);
			toast.show();
	 		Intent j = new Intent(this, Hey.class);
    		startActivity(j);
		}
	}
	
   //puts all the views into an linked list
	  private void findViews() {
	      questions[0] = findViewById(R.id.card1); 
	      questions[0].setOnClickListener(this);
	      questions[1] = findViewById(R.id.card2);
	      questions[1].setOnClickListener(this);
	      questions[2] = findViewById(R.id.card3);
	      questions[2].setOnClickListener(this);
	      questions[3] = findViewById(R.id.card4);
	      questions[3].setOnClickListener(this);
	      questions[4] = findViewById(R.id.card5);
	      questions[4].setOnClickListener(this);
	      questions[5] = findViewById(R.id.card6);
	      questions[5].setOnClickListener(this);
	}
		
}


