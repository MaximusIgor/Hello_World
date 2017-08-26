package ShylovIhorSummer2017;

//О шифре Цезаря: https://ru.wikipedia.org/wiki/%D0%A8%D0%B8%D1%84%D1%80_%D0%A6%D0%B5%D0%B7%D0%B0%D1%80%D1%8F

       // Если известно, что текст зашифрован шифром Цезаря, но не известен ключ (величина сдвига),
       // то взломать шифр можно простым перебором ключей (величина сдвига).

       // Напишите программу расшифровки методом пребора ключей (от -255 до +255).

        //Перед вами текст зашифрованный разными ключами:
       // Первый текст: ÑÝÝÙÜ£ÛÞàÒÔÒÙÎÍÒÊØÛÐàÒÔÒ³ÊßÊ
       // Второй текст: 1==9<￸￸;>￷@2429.-2*￷8;0￸@242￸*6.<(8<5270￩

        //Расшифруйте оба текста, найдите ключи шифрования и пришлите ответы на mystat вместе с вашими программами

        //Ответы:

        //первый текст: https://ru.wikipedia.org/wiki/Java
        //второй текст: https://ru.wikipedia.org/wiki/James_Gosling

public class Ceasar {
    public static void main(String[] args) {
        String str = "1==9<\u0003\uFFF8\uFFF8;>\uFFF7@2429.-2*\uFFF78;0\uFFF8@242\uFFF8\u0013*6.<(\u00108<5270￩";
        int mass[] = new int[str.length()];
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            mass[i] = str.codePointAt(i);
        }
        System.out.println();

        for (int j = -255; j <= 255; j++) {
            System.out.print("Key " + j + ": ");
            for (int i = 0; i < str.length(); i++) {
                System.out.print((char) (mass[i] - j));
            }
            System.out.println();
        }
    }
}

