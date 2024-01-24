import Models.Hospital;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Hospital h=new Hospital("XYZ","XYZ",123,"XYZ");
        h.appointDoctor("MBBS","Vijay",1234,"Heart Surgeon",70000,"12:30-4:30");
        h.createRoom();
        h.admitPatient("abs",25,12345,"@gmail","M","No");
        h.getPatientById("PID1jhvfdsfgb");//Applied exeception
    }
}