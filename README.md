# Exceptions in Programming and Their Handling (seminars)
## Lesson 1. Error Handling in Programming
Implement a method that accepts two integer arrays as arguments and returns a new array, each element of which equals the difference of the elements of the two input arrays in the same cell. If the lengths of the arrays are not equal, you need to somehow notify the user.

Implement a method that accepts two integer arrays as arguments and returns a new array, each element of which equals the quotient of the elements of the two input arrays in the same cell. If the lengths of the arrays are not equal, you need to somehow notify the user. Important: When executing the method, the only exception that the user can see is RuntimeException, i.e. yours.

## Lesson 2. Exceptions and Their Handling
Implement a method that asks the user to input a floating-point number (of type float), and returns the entered value. Inputting text instead of a number should not lead to the application crashing; instead, you need to ask the user to input the data again.
2. If necessary, correct this code (task 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

Given the following code, correct it where required (task 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

Develop a program that will throw an Exception when the user enters an empty string. The user should be shown a message that empty lines cannot be entered.

## Lesson 3. Advanced Exception Handling in Java
Write an application that will ask the user for the following data in any order, separated by a space:
Surname Name Patronymic birthdate phonenumber gender
Data formats:
surname, name, patronymic - strings

birthdate - a string in the format dd.mm.yyyy

phone_number - an unsigned integer without formatting

gender - a latin character f or m.

The application should check the entered data by quantity. If the quantity does not match the required, return an error code, handle it, and show the user a message that he has entered less and more data than required.

The application should try to parse the received values and extract the required parameters from them. If the data formats do not match, you need to throw an exception corresponding to the type of problem. You can use built-in Java types and create your own. The exception should be correctly handled, the user should be shown a message with information about what exactly is wrong.

If everything is entered and processed correctly, a file should be created with a name equal to the surname, and the received data should be recorded in one line in it, in the form

<Surname><Name><Patronymic><birthdate> <phonenumber><gender>

People with the same surname should be recorded in the same file, on separate lines.

Do not forget to close the connection to the file.

If there is a problem with reading-writing to the file, the exception should be correctly handled, the user should see the error stack trace.



# Исключения в программировании и их обработка (семинары)
## Урок 1. Обработка ошибок в программировании
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

## Урок 2. Исключения и их обработка
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
2. Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

## Урок 3. Продвинутая работа с исключениями в Java
Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
Фамилия Имя Отчество датарождения номертелефона пол
Форматы данных:
фамилия, имя, отчество - строки

дата_рождения - строка формата dd.mm.yyyy

номер_телефона - целое беззнаковое число без форматирования

пол - символ латиницей f или m.

Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.

Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.

Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида

<Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>

Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

Не забудьте закрыть соединение с файлом.

При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
