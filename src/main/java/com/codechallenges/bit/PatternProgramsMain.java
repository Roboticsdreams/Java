package com.codechallenges.bit;

public class PatternProgramsMain {

	public  String[] displaypattern01(int n) {
		if (n > 0 && n <= 1000) {
			String[] str = new String[n];
			for (int i = 0; i < n; i++) {
				str[i] = "1 2 3 4 5";
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern02(int n) {
		if (n > 0 && n <= 1000) {
			String[] str = new String[n];
			for (int i = 0; i < n; i++) {
				str[i] = "E D C B A";
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern03(int n) {
		if (n > 0 && n <= 1000) {
			String[] str = new String[n];
			for (int i = 0; i < n; i++) {
				str[i] = "";
				for (int j = 0; j < n - i; j++) {
					if (j == n - i - 1)
						str[i] += i + 1 + "";
					else
						str[i] += i + 1 + " ";
				}
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern04(int n) {
		if (n > 0 && n <= 26) {
			String[] str = new String[n];
			String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char[] alpha = word.toCharArray();
			String temp;
			for (int i = 0; i < n; i++) {
				temp = "";
				for (char j = 'A'; j <= alpha[n - i - 1]; j++) {
					temp += (j == alpha[n - i - 1]) ? j + "" : j + " ";
				}
				str[i] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern05(int n) {
		if (n > 0 && n <= 1000) {
			String[] str = new String[n];
			String temp;
			for (int i = 0; i < n; i++) {
				temp = "";
				for (int j = 0; j < n - i; j++) {
					temp += (j == (n - i - 1)) ? n - j + "" : n - j + " ";
				}
				str[i] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern06(int n) {
		if (n > 0 && n <= 26) {
			String[] str = new String[n];
			String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char[] alpha = word.toCharArray();
			String temp;
			for (int i = 0; i < n; i++) {
				temp = "";
				for (char j = alpha[n - 1]; j >= alpha[i]; j--) {
					temp += (j == alpha[i]) ? j + "" : j + " ";
				}
				str[i] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern07(int n) {
		if (n > 0 && n <= 1000) {
			String[] str = new String[n];
			String temp;
			for (int i = n; i > 0; i--) {
				temp = "";
				for (int j = 0; j < n; j++) {
					temp += (i - 1 > j) ? "  " : (j == n - 1) ? -i + j + 2 : -i + j + 2 + " ";
				}
				str[n - i] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern08(int n) {
		if (n > 0 && n <= 1000) {
			String[] str = new String[n];
			String temp;
			for (int i = 0; i < n; i++) {
				temp = "";
				for (int j = 0; j < n; j++) {
					temp += (j <= i - 1) ? "  " : (j == n - 1) ? "*" : "* ";
				}
				str[i] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern09(int n) {
		if (n > 0 && n <= 1000) {
			String[] str = new String[n];
			String temp;
			for (int i = 0; i < n; i++) {
				temp = "";
				for (int j = 0; j < n; j++) {
					temp += (i > j) ? "  " : (j == n - 1) ? -i + j + 1 : -i + j + 1 + " ";
				}
				str[i] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern10(int n) {
		if (n > 0 && n <= 1000) {
			String[] str = new String[n];
			String temp;
			for (int i = n; i > 0; i--) {
				temp = "";
				for (int j = 0; j < n; j++) {
					temp += (i - 1 > j) ? "  " : (j == n - 1) ? "*" : "* ";
				}
				for (int j = n - 1; j > 0; j--) {
					temp += (i - 1 < j) ? ((j == n - 1) ? " *" : " *") : "";
				}
				str[n - i] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern11(int n) {
		if (n > 0 && n <= 26) {
			String[] str = new String[n];
			String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char[] alpha = word.toCharArray();
			String temp;
			for (int i = n; i > 0; i--) {
				temp = "";
				for (int j = 0; j < n; j++) {
					temp += (i - 1 > j) ? "  " : (j == n - 1) ? alpha[n - i] : alpha[n - i] + " ";
				}
				for (int j = n - 1; j > 0; j--) {
					temp += (i - 1 < j) ? ((j == n - 1) ? " " + alpha[n - i] : " " + alpha[n - i]) : "";
				}
				str[n - i] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern12(int n) {
		if (n > 0 && n <= 1000) {
			String[] str = new String[n];
			String temp;
			int i, j, k;
			for (i = n; i > 0; i--) {
				temp = "";
				for (j = 0; j < n; j++) {
					temp += (i - 1 > j) ? "  " : (j == n - 1) ? -i + j + 2 : -i + j + 2 + " ";
				}
				for (k = n - 1; k > 0; k--) {
					temp += (i - 1 < k)
							? ((k == n - 1) ? " " + (-i + j + 2 + (n - k - 1)) : " " + (-i + j + 2 + (n - k - 1)))
							: "";
				}
				str[n - i] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern13(int n) {
		if (n > 0 && n <= 26) {
			String[] str = new String[n];
			String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char[] alpha = word.toCharArray();
			String temp;
			int i, j, k;
			for (i = n; i > 0; i--) {
				temp = "";
				for (j = 0; j < n; j++) {
					temp += (i - 1 > j) ? "  "
							: (j == n - 1) ? alpha[(n - i) + n - j - 1] : alpha[(n - i) + n - j - 1] + " ";
				}
				for (k = n - 1; k > 0; k--) {
					temp += (i - 1 < k)
							? ((k == n - 1) ? " " + alpha[(n - i) - (n - k)] : " " + alpha[(n - i) - (n - k)])
							: "";
				}
				str[n - i] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern14(int n) {
		if (n > 0 && n <= 26) {
			String[] str = new String[n];
			String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char[] alpha = word.toCharArray();
			String temp;
			int i, j, k;
			for (i = n; i > 0; i--) {
				temp = "";
				for (j = 0; j < n; j++) {
					temp += (i - 1 > j) ? "  " : (j == n - 1) ? alpha[n - j - 1] : alpha[n - j - 1] + " ";
				}
				for (k = n - 1; k > 0; k--) {
					temp += (i - 1 < k) ? ((k == n - 1) ? " " + alpha[n - k] : " " + alpha[n - k]) : "";
				}
				str[n - i] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern15(int n) {
		if (n > 0 && n <= 1000) {
			String[] str = new String[n];
			String temp;
			for (int i = 1; i <= n; i++) {
				temp = "";
				for (int j = 0; j < n; j++) {
					temp += (i - 1 > j) ? "  " : (j == n - 1) ? "*" : "* ";
				}
				for (int j = n - 1; j > 0; j--) {
					temp += (i - 1 < j) ? ((j == n - 1) ? " *" : " *") : "";
				}
				str[i - 1] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern16(int n) {
		if (n > 0 && n <= 1000) {
			String[] str = new String[n];
			String temp;
			int i, j, k = 0;
			for (i = 1; i <= n; i++) {
				temp = "";
				for (j = 0; j < n; j++) {
					temp += (i - 1 > j) ? "  "
							: (j == n - 1) ? ((2 * n - 1) - (i - 1) * 2) : ((2 * n - 1) - (i - 1) * 2) + " ";
				}
				for (k = n - 1; k > 0; k--) {
					temp += (i - 1 < k)
							? ((k == n - 1) ? " " + ((2 * n) - (i * 2) + 1) : " " + ((2 * n - 2) - (i * 2) + 3))
							: "";
				}
				str[i - 1] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern17(int n) {
		if (n > 0 && n <= 1000) {
			String[] str = new String[n];
			String temp;
			int i, j, k = 0;
			for (i = n; i > 0; i--) {
				temp = "";
				for (j = 0; j < n; j++) {
					temp += (i - 1 > j) ? "  "
							: (j == n - 1) ? ((2 * n - 1) - (i - 1) * 2) : ((2 * n - 1) - (i - 1) * 2) + " ";
				}
				for (k = n - 1; k > 0; k--) {
					temp += (i - 1 < k)
							? ((k == n - 1) ? " " + ((2 * n) - (i * 2) + 1) : " " + ((2 * n - 2) - (i * 2) + 3))
							: "";
				}
				str[n - i] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern18(int n) {
		if (n > 0 && n <= 26) {
			String[] str = new String[n];
			String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char[] alpha = word.toCharArray();
			String temp;
			for (int i = n; i > 0; i--) {
				temp = "";
				for (int j = 0; j < n; j++) {
					temp += (i - 1 > j) ? "  " : (j == n - 1) ? alpha[n - i] : alpha[n - i] + " ";
				}
				str[n - i] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern19(int n) {
		if (n > 0 && n <= 26) {
			String[] str = new String[n];
			String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char[] alpha = word.toCharArray();
			String temp;
			for (int i = 1; i <= n; i++) {
				temp = "";
				for (int j = 0; j < n; j++) {
					temp += (i - 1 > j) ? "  " : (j == n - 1) ? alpha[n - i] : alpha[n - i] + " ";
				}
				for (int j = n - 1; j > 0; j--) {
					temp += (i - 1 < j) ? ((j == n - 1) ? " " + alpha[n - i] : " " + alpha[n - i]) : "";
				}
				str[i - 1] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern20(int n) {
		if (n > 0 && n <= 26) {
			String[] str = new String[n];
			String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char[] alpha = word.toCharArray();
			String temp;
			for (int i = 1; i <= n; i++) {
				temp = "";
				for (int j = 0; j < n; j++) {
					temp += (i - 1 > j) ? "  " : (j == n - 1) ? alpha[2 * n - 2 * i] : alpha[2 * n - 2 * i] + " ";
				}
				for (int j = n - 1; j > 0; j--) {
					temp += (i - 1 < j) ? ((j == n - 1) ? " " + alpha[2 * n - 2 * i] : " " + alpha[2 * n - 2 * i]) : "";
				}
				str[i - 1] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern21(int n) {
		if (n > 0 && n <= 26) {
			String[] str = new String[n];
			String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char[] alpha = word.toCharArray();
			String temp;
			int i, j;
			for (i = 0; i < n; i++) {
				temp = "";
				for (j = 0; j < n-i; j++) {
					temp += alpha[j] ;
				}
				str[i] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern22(int n) {
		if (n > 0 && n <= 1000) {
			String[] str = new String[(2 * n) - 1];
			String temp;
			int i, j, k;
			for (i = 1; i < (2 * n); i++) {
				temp = "";
				for (j = 0; j < i && i <= n; j++) {
					temp += (j == i - 1) ? "*" : "* ";
				}
				for (k = 0; k < (2 * n - i) && n < i; k++) {
					temp += (k == ((2 * n) - i - 1)) ? "*" : "* ";
				}
				str[i - 1] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern23(int n) {
		if (n > 0 && n <= 1000) {
			String[] str = new String[(2 * n) - 1];
			String temp;
			int i, j, k;
			for (i = 1; i < (2 * n); i++) {
				temp = "";
				for (j = 0; j < i && i <= n; j++) {
					temp += (j == i - 1) ? n - j - 1 : n - j - 1 + " ";
				}
				for (k = 0; k < (2 * n - i) && n < i; k++) {
					temp += (k == ((2 * n) - i - 1)) ? -(-n - j + k + 1) : -(-n - j + k + 1) + " ";
				}
				str[i - 1] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern24(int n) {
		if (n > 0 && n <= 1000) {
			String[] str = new String[(2 * n) - 1];
			String temp;
			int i, j, k;
			for (i = 0; i < ((2 * n) - 1); i++) {
				temp = "";
				for (j = n - i - 1; j < n && i <= n - 1; j++) {
					temp += (j == n - 1) ? j : j + " ";
				}
				for (k = (2 * n) - i - 1; k > 0 && n <= i; k--) {
					temp += (k == 1) ? n - k : n - k + " ";
				}
				str[i] = temp;

			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern25(int n) {
		if (n > 0 && n <= 26) {
			String[] str = new String[(2 * n) - 1];
			String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char[] alpha = word.toCharArray();
			String temp;
			int i, j, k;
			for (i = 1; i < (2 * n); i++) {
				temp = "";
				for (j = 0; j < i && i <= n; j++) {
					temp += (j == i - 1) ? alpha[n - j - 1] : alpha[n - j - 1] + " ";
				}
				for (k = 0; k < (2 * n - i) && n < i; k++) {
					temp += (k == ((2 * n) - i - 1)) ? alpha[-(-n - j + k + 1)] : alpha[-(-n - j + k + 1)] + " ";
				}
				str[i - 1] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern26(int n) {
		if (n > 0 && n <= 26) {
			String[] str = new String[(2 * n) - 1];
			String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char[] alpha = word.toCharArray();
			String temp;
			int i, j, k;
			for (i = 0; i < (2 * n) - 1; i++) {
				temp = "";
				for (j = n - i - 1; j < n && i <= n - 1; j++) {
					temp += (j == n - 1) ? alpha[j] : alpha[j] + " ";
				}
				for (k = (2 * n) - i - 1; k > 0 && n <= i; k--) {
					temp += (k == 1) ? alpha[n - k] : alpha[n - k] + " ";
				}
				str[i] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern27(int n) {
		if (n > 0 && n <= 1000) {
			String[] str = new String[(2 * n) - 1];
			String temp;
			int i, j, k = 0;
			for (i = 0; i < (2 * n) - 1; i++) {
				temp = "";
				for (j = n - 1; j >= 0 && i <= n - 1; j--) {
					temp += (i < j) ? "  " : (j == 0) ? "*" : "* ";
				}
				for (k = 0; k < n && n <= i; k++) {
					temp += ((i - n + 1) > k) ? "  " : (k == n - 1) ? "*" : "* ";
				}
				str[i] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern28(int n) {
		if (n > 0 && n <= 1000) {
			String[] str = new String[(2 * n) - 1];
			String temp;
			int i, j;
			for (i = 0; i < (2 * n) - 1; i++) {
				temp = "";
				for (j = n - 1; j >= 0 && i <= n - 1; j--) {
					temp += (i < j) ? "  " : (j == 0) ? j - i + n - 1 : j - i + n - 1 + " ";
				}
				for (j = 0; j < n && n <= i; j++) {
					temp += (-(n - i - 1) > j) ? "  " : (j == n - 1) ? n - (j - i + n) : n - (j - i + n) + " ";
				}
				str[i] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern29(int n) {
		if (n > 0 && n <= 1000) {
			String[] str = new String[(2 * n) - 1];
			String temp;
			int i, j;
			for (i = 0; i < (2 * n) - 1; i++) {
				temp = "";
				for (j = n - 1; j >= 0 && i <= n - 1; j--) {
					temp += (i < j) ? "  " : (j == 0) ? n - j - 1 : n - j - 1 + " ";
				}
				for (j = 0; j < n && n <= i; j++) {
					temp += (-(n - i - 1) > j) ? "  " : (j == n - 1) ? j : j + " ";
				}
				str[i] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern30(int n) {
		if (n > 0 && n <= 26) {
			String[] str = new String[(2 * n) - 1];
			String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char[] alpha = word.toCharArray();
			String temp;
			int i, j;
			for (i = 0; i < (2 * n) - 1; i++) {
				temp = "";
				for (j = n - 1; j >= 0 && i <= n - 1; j--) {
					temp += (i < j) ? "  " : (j == 0) ? alpha[n - j - 1] : alpha[n - j - 1] + " ";
				}
				for (j = 0; j < n && n <= i; j++) {
					temp += (-(n - i - 1) > j) ? "  " : (j == n - 1) ? alpha[j] : alpha[j] + " ";
				}
				str[i] = temp;
			}
			return str;
		}
		return null;
	}

	public  String[] displaypattern31(int n) {
		if (n > 0 && n <= 26) {
			String[] str = new String[(2 * n) - 1];
			String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char[] alpha = word.toCharArray();
			String temp;
			int i, j;
			for (i = 0; i < (2 * n) - 1; i++) {
				temp = "";
				for (j = n - 1; j >= 0 && i <= n - 1; j--) {
					temp += (i < j) ? "  " : (j == 0) ? alpha[j - i + n - 1] : alpha[j - i + n - 1] + " ";
				}
				for (j = 0; j < n && n <= i; j++) {
					temp += (-(n - i - 1) > j) ? "  "
							: (j == n - 1) ? alpha[n - (j - i + n)] : alpha[n - (j - i + n)] + " ";
				}
				str[i] = temp;
			}
			return str;
		}
		return null;
	}

	/*
	 * Program to calculate the weight of the given string based on the below table
	 * A,B,C =2 D,E,F =3 G,H,I =4 J,K,L =5 M,N,0 =6 P,Q,R,S =7 T,U,V =8 W,X,Y,Z =9
	 */
	public double displaypattern32(String str) {
		int i = 0, len;
		double res = 1;
		str = str.toUpperCase();
		len = str.length();
		char[] s = new char[len];
		s = str.toCharArray();
		while (i < len) {
			switch (s[i]) {
			case 'A':
			case 'B':
			case 'C':
				res = res * 2;
				break;

			case 'D':
			case 'E':
			case 'F':
				res = res * 3;
				break;
			case 'G':
			case 'H':
			case 'I':
				res = res * 4;
				break;
			case 'J':
			case 'K':
			case 'L':
				res = res * 5;
				break;
			case 'M':
			case 'N':
			case 'O':
				res = res * 6;
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				res = res * 7;
				break;
			case 'T':
			case 'U':
			case 'V':
				res = res * 8;
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				res = res * 9;
				break;
			}
			i++;
		}
		return res;
	}

}
