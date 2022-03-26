A. Числовые ребусы

Ограничение времени	1 секунда
Ограничение памяти	512Mb
Ввод	стандартный ввод или input.txt
Вывод	стандартный вывод или output.txt

Алиса изучает английский язык. Ей надоела обычная речь, поэтому она решила говорить числовыми ребусами:
1.	Каждой строчной букве латинского алфавита Алиса сопоставила двоичный разряд, начиная с младшего: a — 0-й разряд, b — 1-й, …, z — 25-й.
2.	Чтобы произнести букву, Алиса инвертирует соответствующий букве бит в специальной переменной W и сообщает новое значение W в десятичной системе.
Определение: инверсия бита j в числе x  — изменение значения j-го разряда числа x в двоичной системе на противоположное (0 становится 1, 1 становится 0).
Пример: число 15 (1111) после инверсии бита 2 становится равным числу 11 (1011).
3.	Также Алиса произносит пробел, используя для этого 26-й разряд.
Значение переменной W перед произнесением Алисой первого символа равно 0.
Напишите программу, которая переведет сказанный Алисой числовой ребус.
Примечание: Алиса использует пробел наравне с буквами латинского алфавита  — для пробела не существует дополнительных ограничений и условий для его произнесения.
Формат ввода
В первой строке содержится единственное целое число n (1≤n≤500)  — количество чисел, сказанных Алисой.
Во второй строке расположено n целых чисел Wi (0≤Wi<227)  — значения переменной W после произнесения Алисой i-го символа.
Формат вывода
В единственной строке выведите n символов  — строчные буквы латинского алфавита или пробел в порядке произнесения их Алисой.
Пример 1
Ввод
  	Вывод
  
5
1 2049 2305 2309 2325
	alice

Пример 2
Ввод
  	Вывод
  
3
1 3 2
	aba

Пример 3
Ввод
  	Вывод
  
12
4 132 148 262292 262164 262420 393492 393476 67502340 67502336 67502337 68026625
	cheshire cat

Примечания
Рассмотрим детально первый пример входных данных:
1.	Начальное значение переменной W равно 0 (по условию задачи).
2.	Сначала Алиса произносит символ a, поэтому значение переменной W становится равным 20=1.
3.	Затем произносится символ l, которому соответствует 11-й разряд, поэтому значение переменной W становится равным 20+211=2049.
4.	Далее следует символ i (8-й разряд), поэтому W=20+211+28=2305.
5.	Предпоследним символом является c (2-й разряд)  — W=20+211+28+22=2309.
6.	Завершает фразу символ e (4-й разряд)  — итоговое значение W равно 20+211+28+22+24=2325.
Во втором входном примере последовательность W следующая:
1.	После первого символа a значение W=20=1.
2.	После символа b значение W=20+21=3.
3.	После произнесения второго символа a значение W будет равно 21=2, так как 0-й бит инвертируется из 1 в 0.