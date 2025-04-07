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
	j가 i와 같거나 클때 출력

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

void printFibo(int n, int current) { //반복문 대용 재귀함수 0부터 n까지
	if (current > n) return;
	printf("%d ", fibonacci(current));
	printFibo(n, current + 1);
}

int main(void) {
	int d;
	printf("자연수 N을 입력하세요 (0 ~ 46): ");
	scanf_s("%d", &d);
	printf("0번째부터 %번째까지의 피보나치 수열:\n", d);
	printFibo(d, 0);

	return 0;
} */
