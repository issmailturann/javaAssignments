package Chapter3Assign1;

public class Hello {

    String world = "Everyone!";

    public String sayHello(String who){
        String sentence;

        if(who != ""){
                sentence = "Hello " + who;
        }
        else{
                sentence = "Hello " + world;
        }
    return sentence;
    }

}
