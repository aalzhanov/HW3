public class Main {

    public static void main(String[] args) {
	String[] name = {"Али", "Аман","Бакыт"};
	for (String name1:name){
	    switch (name1){
            case "Али":
                System.out.println(name1+"Добрый утро");
                break;
            case "Аман":
                System.out.println(name1+"Добрый день");
                break;
            case "Бакыт":
                System.out.println(name1+"Добрый вечер");
                break;
        }
    }
    }
}
