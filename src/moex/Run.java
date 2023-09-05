package moex;

public class Run {
    public static void main(String[] args) {
//        "https://www.moex.com/api/contract/OpenOptionService/" "/F/" "/json"
        System.out.println(MoexGetData.Run( "https://www.moex.com/api/contract/OpenOptionService/",
                "01.08.2023", "/F/", "ALRS", "/json"));
    }
}
