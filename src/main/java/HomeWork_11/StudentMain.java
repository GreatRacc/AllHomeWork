package HomeWork_11;


import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Михаил");
        students.add("Андрей");
        students.add("Наташа");
        students.add("Александр");
        students.add("Алексей");
        List<String> newStudents = List.of("Пётр", "Артур", "Никита", "Константин", "Егор");
        students.addAll(newStudents);
        System.out.println("Список с новыми учениками: " + students);
        students.remove("Алексей");
        System.out.println("Алексей удалён из списка: " + students);
        students.remove(5);
        System.out.println("ученик по индексу '5' удалён: " + students);
        System.out.println("присутствует ли в списке 'Наташа'? " + students.contains("Наташа"));
        List<String> checkStud = List.of("Наташа", "Андрей");
        System.out.println("присутствует ли в основном списке студенты из списка 'checkStud'? "
                + students.containsAll(checkStud));
        System.out.println("Общее количество студентов: " + students.size());
        System.out.println("Пустой ли список? " + students.isEmpty());
        students.clear();
        System.out.println("Точно ли список пустой после очистки? " + students.isEmpty());
    }
}
