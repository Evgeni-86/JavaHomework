package mult;

/*
Volatile - храненить значение в общей памяти, а не в кэшах ядер.

Используется когда один поток меняет значение,
а остальные потоки только читают значение.

Иначе из-за атомарной операции(операции из нескольких шагов) путаница.
Data Race.

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
    //если значение переменной обьект??? проверить

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