#include<stdio.h>
/* task1
int main(void) {
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 5; j++) {
			if (j >= i) printf("%d ", j + 1);
			else printf("%d ", 0);
		}
		printf("\n");
	}
	ij
	00 01 02 03 04
	10 11 12 13 14
	20 21 22 23 24
	30 31 32 33 34
	40 41 42 43 44
	j�� i�� ���ų� Ŭ�� ���

	return 0;
}*/
/* task2
int fibonacci(int n) {
	if (n <= 1) {
		return n;
	}
	else {
		return fibonacci(n - 1) + fibonacci(n - 2);  //n - 1 + n - 2
	}
}

void printFibo(int n, int current) { //�ݺ��� ��� ����Լ� 0���� n����
	if (current > n) return;
	printf("%d ", fibonacci(current));
	printFibo(n, current + 1);
}

int main(void) {
	int d;
	printf("�ڿ��� N�� �Է��ϼ��� (0 ~ 46): ");
	scanf_s("%d", &d);
	printf("0��°���� %��°������ �Ǻ���ġ ����:\n", d);
	printFibo(d, 0);

	return 0;
} */
