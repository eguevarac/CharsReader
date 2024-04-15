import java.util.ArrayList;

public class MyThread extends Thread {

    private int asciiNum;
    private ArrayList<String> lines;
    private ArrayList<String> results;


    public MyThread(int asciiNum, ArrayList<String> lines, ArrayList<String> results) {
        this.lines = lines;
        this.asciiNum = asciiNum;
        this.results = results;
    }

    @Override
    public void run() {
        int timesRepeat = 0;
        char letter = (char) asciiNum;
        long startTime = System.nanoTime();


        for (String line : lines) {
            for (int i = 0; i < line.length(); i++) {
                char actualChar = line.charAt(i);
                if(actualChar == letter){
                    timesRepeat++;
                }
            }
        }
        long finishTime = System.nanoTime();

        if(asciiNum <100){
            results.add(letter + "      (0"+asciiNum+")    " + timesRepeat + "      " + ((finishTime-startTime)*10e-6) + "ms");
        }else{
            results.add(letter + "      ("+asciiNum+")    " + timesRepeat + "      " + ((finishTime-startTime)*10e-6) + "ms");
        }

    }
}
