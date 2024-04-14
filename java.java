public class java {
    public static void main(String[] args) {
        Tv.Model = "Samsung 17413labdla";
        Tv.getModel();
        Tv tv1 = new Tv();
        tv1.setVoiceAssistent("Siri");
        tv1.getNumbersChannel();
    }
}

class Tv{
    private static String Model;
    private int numbersChannel;
    private String voiceAssistant;
    boolean isWork = true;


    //Model Of Tv
    public static void getModel(){
        System.out.println(model);
    }
    //Model Of Voice Assistant
    public void setVoiceAssistent(String voiceAssistant){
        this.voiceAssistant = voiceAssistant;
    }
    //Massive For Channel
    public void getNumbersChannel(){
        int[] numbers = new int[21];
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = i;
        }
        for(int i = 0; i<numbers.length; i++){
            if(i==15){
                isWork = false;
                System.out.println("15 канал не работает по техническим неполадкам");
                continue;
            }
             System.out.println("Вам доступно: " + numbers[i] + " каналов");
        }
    }

}