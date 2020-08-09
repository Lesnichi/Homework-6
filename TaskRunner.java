package com.vl.homework6;

import com.vl.homework6.figures.*;

/**
 * Занятие 15.1. Наследование. Полиморфизм. ДЗ.
 * Создать иерархию классов, описывающих геометрические фигуры
 * на плоскости.
 * - Можно пользоваться результатами предыдущего ДЗ.
 * - В иерархии должно быть не менее 10 классов/интерфейсов и хотя
 * бы 2 уровня вложенности.
 * - Продемонстрировать переопределение методов в иерархии.
 * - Продемонстрировать добавление собственных методов в классах-
 * наследниках (можно с помощью интерфейсов).
 * Например, расчёт диагонали в прямоугольнике, расчёт высоты в
 * треугольнике.
 * - При разработке иерархии держать в уме принцип инкапсуляции,
 * выбирать корректные имена классов и методов,
 * пользоваться преимуществами полиморфизма.
 * - Отдавайте предпочтение интерфейсам, а не абстрактным классам.
 * - При переопределении методов обязательно использовать
 * аннотацию @Override
 * - Не создавать лишних классов в системе (полностью дублирующих
 * или не содержащих назначения)
 * - Каждый класс должен выполнять своё назначение.
 * - Создать общие методы:
 * 1. Рассчитывающий площадь фигуры.
 * 2. Принимающий в качестве параметра фигуру и определяющий,
 * равны ли площади текущей и полученной фигуры.
 * - Создать класс ShapeUtils со статическими методами:
 * 1. Определяющим, является ли фигура прямоугольником.
 * 2. Определяющим, является ли фигура треугольником.
 *  
 * - Для каждого неабстрактного класса переопределить метод
 * toString() класса для представления информации о классах в
 * строковой форме.
 * - В этом задании нет одного правильного решения, подойдите к
 * нему творчески.
 */
public class TaskRunner {

    public static void main(String[] args) {
        Rhombus rhombus = new Rhombus("Ромб", new Point(10, 15), new Point(15, 10), new Point(10, 5), new Point(5, 10));
        System.out.println(rhombus.getName());
        System.out.println("Площадь = " + rhombus.getArea());

        Circle circle = new Circle("Круг", new Point(10, 10), 5);
        System.out.println(circle.getName());
        System.out.println("Площадь = " + circle.getArea());

        Cylinder cylinder = new Cylinder("Цилиндр", new Point(5, 5), 5, 10);
        System.out.println(cylinder.getName());
        System.out.println("Площадь = " + cylinder.getArea());
        System.out.println("Объем = " + cylinder.getVolume());

        Sphere sphere = new Sphere("Сфера", new Point(5, 5), 5);
        System.out.println(sphere.getName());
        System.out.println("Площадь = " + sphere.getArea());
        System.out.println("Объем = " + sphere.getVolume());


        Triangle triangle = new Triangle("Треугольник", new Point(0, 0), new Point(10, 0), new Point(0, 10));
        System.out.println(triangle.getName());
        System.out.println("Площадь = " + triangle.getArea());

        Rectangle rectangle = new Rectangle("Прямоугольник", new Point(0, 10), new Point(10, 0));
        System.out.println(rectangle.getName());
        System.out.println("Площадь = " + rectangle.getArea());
        System.out.println("Диагональ = " + rectangle.getDiagonal());

        System.out.println(ShapeUtils.isCompare(rectangle, triangle));
        System.out.println(ShapeUtils.isRectangle(rectangle));
        System.out.println(ShapeUtils.isTriangle(rectangle));
    }
}