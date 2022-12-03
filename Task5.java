// Программа разбивает предложение на слова,
// сортирует слова по длине с использованием TreeMap
// и выводит отсортированные слова на печать
// (преобразование строки в массив строк и сортировка)
  
import java.util.*;
import java.util.Map.Entry;
  
public class Task5 {
  // Управляющая программа 
  public static void main(String args[])
  {
      String s = "Если вы можете мечтать об этом вы можете это сделать";
      System.out.println("Исходная строка текста (предложение): ");
      // Вывод исходной строки (предложения) на печать
      System.out.println(s);
      
      // Разбиваем исходную строку (предложение) на слова
      // (из строки формируем массив строк)
      String [] arr=s.split(" ");
      
      int n = arr.length; // количество слов в предложении
              
      // Вызов метода сортировки массива строк 
      // (слов из исходного предложения)
      arr = sort(arr, n);

      System.out.println("Слова, сортированные по количеству букв: ");
      // Вызов метода вывода на печать массива строк
      printArraystring(arr, n); 
  }

    // Метод сортировки массива строк по длине с использованием TreeMap
    static String[] sort(String[] str, int n)
    {
        TreeMap<Integer, ArrayList<String> > map = new TreeMap<Integer, ArrayList<String> >();
  
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(str[i].length(), new ArrayList<String>());
            map.get(str[i].length()).add(str[i]);
        }
  
        int temp = 0;
  
        for (Entry<Integer, ArrayList<String> >
            e : map.entrySet()) {
            for (int i = 0; i < e.getValue().size(); i++) {
                str[temp] = e.getValue().get(i);
                temp++;
            }
        }
        return str;
    }
  
    // Метод вывода массива строк на печать
    static void printArraystring(String str[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(str[i] + " ");
    }
  
    
}