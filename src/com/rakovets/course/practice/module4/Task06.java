package com.rakovets.course.practice.module4;

import java.util.Scanner;

/**
 * Разработать программу для бухгалтерии:
 * Конвертировать чесловую сумму в сумму бухгалтерском формате, т.е. начиная справа, каждые три позиции отделяются
 * пробелом. Известно:
 * @param amount сумма
 * @return сумма в бухгалтерском формате
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task06 {
	public static void main(String[] args) {
		// Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
		Scanner scanner = new Scanner(System.in);

		// Код необходимый для тестирования, не изменять
		long amount = (args.length!=1 ? scanner.nextLong():Long.parseLong(args[0]));

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		if (amount < 0){
			System.out.print("-");
			amount = amount*(-1);
		}
		double digits = (long) (Math.ceil(Math.log10(amount)+0.5));
		long temporaryAmount;
		long temporaryDigits = (long) digits;
		while(digits % 3 != 0){
			temporaryDigits = temporaryDigits - 1;
			temporaryAmount = (long) (( amount) / (Math.pow(10,temporaryDigits)));
			System.out.print(temporaryAmount);
			amount = (long) (amount - temporaryAmount*(Math.pow(10,temporaryDigits)));
			digits = digits -1;
			if (digits % 3 == 0){
				System.out.print(" ");
			}
		}
		for(int i = 1; i <= (digits/3); i++){
			temporaryDigits = temporaryDigits - 3;
			temporaryAmount = (long) ((amount) / (Math.pow(10,temporaryDigits)));
			System.out.print(temporaryAmount);
			amount = (long) (amount - temporaryAmount*(Math.pow(10,temporaryDigits)));
			if (temporaryDigits != 0){
				System.out.print(" ");
			}
			}
		}
	}