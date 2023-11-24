package mult;

/*
Volatile - храненить значение в общей памяти, а не в кэшах ядер.

Проблемы без volatile и с использованием volatile:
а) Путанница из-за не атомарности операции.
б) Data Race.

Volatile решает проблему если, когда один поток меняет значение,
а остальные потоки только читают значение.

Пример:
Изменение работы одного потока из другого путем изменения флага,
если поток работает в цикле

!!!!!!
При использовании System.out.println()
1) Срабатывание механизмов синхронизации и обновление значений переменных
памяти кэша и основной(main) памяти.
//TODO Какие операции вызывают такую синхронизацию???
*/
public class Volatile extends Thread {
    public volatile boolean flag = true;

    @Override
    public void run() {
        int counter = 0;
        while (flag){
            counter++;
//            System.out.println(counter++);
        }
        System.out.println("counter " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Volatile aa = new Volatile();
        aa.start();
        Thread.sleep(2000);
        aa.flag = false;
    }
}
