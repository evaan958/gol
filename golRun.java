//Evaan J
//Jan .12
//Game of life

public class golRun  {
    
    public static void main (String [] args){

        //Creating an object 
        golMain table = new golMain();
        golGUI gui = new golGUI();
       
       
        //Creating a 2d array
        boolean [][] cordinate1 = new boolean [0][0];

        //Seting an int equal to a method so it will run the code inside it
        table.enter();
        int rowValue = (table.rowInput(0))+2;
        int columnValue = (table.columnInput(0))+2;
        int numOrganism = table.numOrganisms (0);
        cordinate1 = table.create(rowValue,columnValue,numOrganism, cordinate1);
        int genValue = table.gen(0);
        for(int j=0; j<genValue ; j++){
            System.out.println("");
            table.print(rowValue,columnValue,cordinate1);
            table.future(cordinate1,rowValue,columnValue);    
        } 
    }
    
}
