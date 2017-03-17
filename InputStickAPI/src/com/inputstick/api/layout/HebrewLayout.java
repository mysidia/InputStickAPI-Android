package com.inputstick.api.layout;

public class HebrewLayout extends KeyboardLayout {
	
	public static final String LOCALE_NAME = 			"he-IL";
	public static final String LAYOUT_NAME_NATIVE = 	"עִבְרִית";
	public static final String LAYOUT_NAME_ENGLISH = 	"Hebrew";
	public static final String LAYOUT_VARIANT = 		"IL";
	
	//{char (16b unicode), modifier, key, deadkey_modifier, deadkey}
	//he-IL
	private static final int[][] FAST_LUT = {
		{	 0,	    0,	    0,	    0,	    0	},	// empty	
		{	10,	    0,	   40,	    0,	    0	},	// enter
		{	 9,	    0,	   43,	    0,	    0	},	// tab			
		{   32,	    0,	   44,	    0,	    0	},	// space
		{   33,	    2,	   30,	    0,	    0	},	// !
		{   34,	    2,	   52,	    0,	    0	},	// "
		{   35,	    2,	   32,	    0,	    0	},	// #
		{   36,	    2,	   33,	    0,	    0	},	// $
		{   37,	    2,	   34,	    0,	    0	},	// %
		{   38,	    2,	   36,	    0,	    0	},	// &
		{   39,	    0,	   26,	    0,	    0	},	// '
		{   40,	    2,	   39,	    0,	    0	},	// (
		{   41,	    2,	   38,	    0,	    0	},	// )
		{   42,	    2,	   37,	    0,	    0	},	// *
		{   43,	    2,	   46,	    0,	    0	},	// +
		{   44,	    0,	   52,	    0,	    0	},	// ,
		{   45,	    0,	   45,	    0,	    0	},	// -
		{   46,	    0,	   56,	    0,	    0	},	// .
		{   47,	    0,	   20,	    0,	    0	},	// /
		{   48,	    0,	   39,	    0,	    0	},	// 0
		{   49,	    0,	   30,	    0,	    0	},	// 1
		{   50,	    0,	   31,	    0,	    0	},	// 2
		{   51,	    0,	   32,	    0,	    0	},	// 3
		{   52,	    0,	   33,	    0,	    0	},	// 4
		{   53,	    0,	   34,	    0,	    0	},	// 5
		{   54,	    0,	   35,	    0,	    0	},	// 6
		{   55,	    0,	   36,	    0,	    0	},	// 7
		{   56,	    0,	   37,	    0,	    0	},	// 8
		{   57,	    0,	   38,	    0,	    0	},	// 9
		{   58,	    2,	   51,	    0,	    0	},	// :
		{   59,	    0,	   53,	    0,	    0	},	// ;
		{   60,	    2,	   55,	    0,	    0	},	// <
		{   61,	    0,	   46,	    0,	    0	},	// =
		{   62,	    2,	   54,	    0,	    0	},	// >
		{   63,	    2,	   56,	    0,	    0	},	// ?
		{   64,	    2,	   31,	    0,	    0	},	// @
		{   65,	    2,	    4,	    0,	    0	},	// A
		{   66,	    2,	    5,	    0,	    0	},	// B
		{   67,	    2,	    6,	    0,	    0	},	// C
		{   68,	    2,	    7,	    0,	    0	},	// D
		{   69,	    2,	    8,	    0,	    0	},	// E
		{   70,	    2,	    9,	    0,	    0	},	// F
		{   71,	    2,	   10,	    0,	    0	},	// G
		{   72,	    2,	   11,	    0,	    0	},	// H
		{   73,	    2,	   12,	    0,	    0	},	// I
		{   74,	    2,	   13,	    0,	    0	},	// J
		{   75,	    2,	   14,	    0,	    0	},	// K
		{   76,	    2,	   15,	    0,	    0	},	// L
		{   77,	    2,	   16,	    0,	    0	},	// M
		{   78,	    2,	   17,	    0,	    0	},	// N
		{   79,	    2,	   18,	    0,	    0	},	// O
		{   80,	    2,	   19,	    0,	    0	},	// P
		{   81,	    2,	   20,	    0,	    0	},	// Q
		{   82,	    2,	   21,	    0,	    0	},	// R
		{   83,	    2,	   22,	    0,	    0	},	// S
		{   84,	    2,	   23,	    0,	    0	},	// T
		{   85,	    2,	   24,	    0,	    0	},	// U
		{   86,	    2,	   25,	    0,	    0	},	// V
		{   87,	    2,	   26,	    0,	    0	},	// W
		{   88,	    2,	   27,	    0,	    0	},	// X
		{   89,	    2,	   28,	    0,	    0	},	// Y
		{   90,	    2,	   29,	    0,	    0	},	// Z
		{   91,	    0,	   48,	    0,	    0	},	// [
		{   92,	    0,	   49,	    0,	    0	},	// backslash
		{   93,	    0,	   47,	    0,	    0	},	// ]
		{   94,	    2,	   35,	    0,	    0	},	// ^
		{   95,	    2,	   45,	    0,	    0	},	// _
		{  123,	    2,	   48,	    0,	    0	},	// {
		{  124,	    2,	   49,	    0,	    0	},	// |
		{  125,	    2,	   47,	    0,	    0	},	// }
		{  126,	    2,	   53,	    0,	    0	},	// ~
		{ 1471,	   66,	   45,	    0,	    0	},	// ֿ
		{ 1488,	    0,	   23,	    0,	    0	},	// א
		{ 1489,	    0,	    6,	    0,	    0	},	// ב
		{ 1490,	    0,	    7,	    0,	    0	},	// ג
		{ 1491,	    0,	   22,	    0,	    0	},	// ד
		{ 1492,	    0,	   25,	    0,	    0	},	// ה
		{ 1493,	    0,	   24,	    0,	    0	},	// ו
		{ 1494,	    0,	   29,	    0,	    0	},	// ז
		{ 1495,	    0,	   13,	    0,	    0	},	// ח
		{ 1496,	    0,	   28,	    0,	    0	},	// ט
		{ 1497,	    0,	   11,	    0,	    0	},	// י
		{ 1498,	    0,	   15,	    0,	    0	},	// ך
		{ 1499,	    0,	    9,	    0,	    0	},	// כ
		{ 1500,	    0,	   14,	    0,	    0	},	// ל
		{ 1501,	    0,	   18,	    0,	    0	},	// ם
		{ 1502,	    0,	   17,	    0,	    0	},	// מ
		{ 1503,	    0,	   12,	    0,	    0	},	// ן
		{ 1504,	    0,	    5,	    0,	    0	},	// נ
		{ 1505,	    0,	   27,	    0,	    0	},	// ס
		{ 1506,	    0,	   10,	    0,	    0	},	// ע
		{ 1507,	    0,	   51,	    0,	    0	},	// ף
		{ 1508,	    0,	   19,	    0,	    0	},	// פ
		{ 1509,	    0,	   55,	    0,	    0	},	// ץ
		{ 1510,	    0,	   16,	    0,	    0	},	// צ
		{ 1511,	    0,	    8,	    0,	    0	},	// ק
		{ 1512,	    0,	   21,	    0,	    0	},	// ר
		{ 1513,	    0,	    4,	    0,	    0	},	// ש
		{ 1514,	    0,	   54,	    0,	    0	},	// ת
		{ 1520,	   66,	   24,	    0,	    0	},	// װ
		{ 1521,	   66,	   13,	    0,	    0	},	// ױ
		{ 1522,	   66,	   11,	    0,	    0	},	// ײ
		{ 8206,	   64,	   32,	    0,	    0	},	// ‎
		{ 8207,	   64,	   33,	    0,	    0	},	// ‏
		{ 8362,	   66,	   33,	    0,	    0	},	// ₪
		{ 8364,	   66,	    8,	    0,	    0	},	// €
	};
	
	
	public static final int LUT[][] = {
		/*	0	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	1	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,						
		/*	2	*/	{	0	,	(int)'1'	,	0x0021		,	-1		,	-1		,	-1		}	, // TODO SGCap
		/*	3	*/	{	0	,	(int)'2'	,	0x0040		,	-1		,	-1		,	-1		}	, // TODO SGCap
		/*	4	*/	{	0	,	(int)'3'	,	0x0023		,	-1		,	0x200e	,	-1		}	, // TODO SGCap
		/*	5	*/	{	0	,	(int)'4'	,	0x0024		,	-1		,	0x200f	,	0x20aa	}	, // TODO SGCap
		/*	6	*/	{	0	,	(int)'5'	,	0x0025		,	-1		,	-1		,	-1		}	, // TODO SGCap
		/*	7	*/	{	0	,	(int)'6'	,	0x005e		,	-1		,	-1		,	-1		}	, // TODO SGCap
		/*	8	*/	{	0	,	(int)'7'	,	0x0026		,	-1		,	-1		,	-1		}	, // TODO SGCap
		/*	9	*/	{	0	,	(int)'8'	,	0x002a		,	-1		,	-1		,	-1		}	, // TODO SGCap
		/*	0a	*/	{	0	,	(int)'9'	,	0x0029		,	-1		,	-1		,	-1		}	, // TODO SGCap
		/*	0b	*/	{	0	,	(int)'0'	,	0x0028		,	-1		,	-1		,	-1		}	, // TODO SGCap
		/*	0c	*/	{	0	,	0x002d		,	0x005f		,	-1		,	-1		,	0x05bf	}	, // TODO SGCap
		/*	0d	*/	{	0	,	0x003d		,	0x002b		,	-1		,	-1		,	-1		}	, // TODO SGCap
		/*	0e	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	0f	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		
		/*	10	*/	{	1	,	0x002f		,	(int)'Q'	,	-1		,	-1		,	-1		}	,
		/*	11	*/	{	1	,	0x0027		,	(int)'W'	,	-1		,	-1		,	-1		}	,
		/*	12	*/	{	1	,	0x05e7		,	(int)'E'	,	-1		,	-1		,	0x20ac	}	,
		/*	13	*/	{	1	,	0x05e8		,	(int)'R'	,	-1		,	-1		,	-1		}	,
		/*	14	*/	{	1	,	0x05d0		,	(int)'T'	,	-1		,	-1		,	-1		}	,
		/*	15	*/	{	1	,	0x05d8		,	(int)'Y'	,	-1		,	-1		,	-1		}	,
		/*	16	*/	{	1	,	0x05d5		,	(int)'U'	,	-1		,	-1		,	0x05f0	}	,
		/*	17	*/	{	1	,	0x05df		,	(int)'I'	,	-1		,	-1		,	-1		}	,
		/*	18	*/	{	1	,	0x05dd		,	(int)'O'	,	-1		,	-1		,	-1		}	,
		/*	19	*/	{	1	,	0x05e4		,	(int)'P'	,	-1		,	-1		,	-1		}	,
		/*	1a	*/	{	0	,	0x005d		,	0x007d		,	0x200e	,	-1		,	-1		}	, // TODO SGCap
		/*	1b	*/	{	0	,	0x005b		,	0x007b		,	0x200f	,	-1		,	-1		}	, // TODO SGCap
		/*	1c	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	1d	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	1e	*/	{	1	,	0x05e9		,	(int)'A'	,	-1		,	-1		,	-1		}	,
		/*	1f	*/	{	1	,	0x05d3		,	(int)'S'	,	-1		,	-1		,	-1		}	,
		
		/*	20	*/	{	1	,	0x05d2		,	(int)'D'	,	-1		,	-1		,	-1		}	,
		/*	21	*/	{	1	,	0x05db		,	(int)'F'	,	-1		,	-1		,	-1		}	,
		/*	22	*/	{	1	,	0x05e2		,	(int)'G'	,	-1		,	-1		,	-1		}	,
		/*	23	*/	{	1	,	0x05d9		,	(int)'H'	,	-1		,	-1		,	0x05f2	}	,
		/*	24	*/	{	1	,	0x05d7		,	(int)'J'	,	-1		,	-1		,	0x05f1	}	,
		/*	25	*/	{	1	,	0x05dc		,	(int)'K'	,	-1		,	-1		,	-1		}	,
		/*	26	*/	{	1	,	0x05da		,	(int)'L'	,	-1		,	-1		,	-1		}	,
		/*	27	*/	{	0	,	0x05e3		,	0x003a		,	-1		,	-1		,	-1		}	, // TODO SGCap
		/*	28	*/	{	0	,	0x002c		,	0x0022		,	-1		,	-1		,	-1		}	, // TODO SGCap
		/*	29	*/	{	0	,	0x003b		,	0x007e		,	-1		,	-1		,	-1		}	, // TODO SGCap
		/*	2a	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	2b	*/	{	0	,	0x005c		,	0x007c		,	0x001c	,	-1		,	-1		}	, // TODO SGCap
		/*	2c	*/	{	1	,	0x05d6		,	(int)'Z'	,	-1		,	-1		,	-1		}	,
		/*	2d	*/	{	1	,	0x05e1		,	(int)'X'	,	-1		,	-1		,	-1		}	,
		/*	2e	*/	{	1	,	0x05d1		,	(int)'C'	,	-1		,	-1		,	-1		}	,
		/*	2f	*/	{	1	,	0x05d4		,	(int)'V'	,	-1		,	-1		,	-1		}	,
		
		/*	30	*/	{	1	,	0x05e0		,	(int)'B'	,	-1		,	-1		,	-1		}	,
		/*	31	*/	{	1	,	0x05de		,	(int)'N'	,	-1		,	-1		,	-1		}	,
		/*	32	*/	{	1	,	0x05e6		,	(int)'M'	,	-1		,	-1		,	-1		}	,
		/*	33	*/	{	0	,	0x05ea		,	0x003e		,	-1		,	-1		,	-1		}	, // TODO SGCap
		/*	34	*/	{	0	,	0x05e5		,	0x003c		,	-1		,	-1		,	-1		}	, // TODO SGCap
		/*	35	*/	{	0	,	0x002e		,	0x003f		,	-1		,	-1		,	-1		}	, // TODO SGCap
		/*	36	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	37	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	38	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	39	*/	{	0	,	0x0020		,	0x0020		,	0x0020	,	-1		,	-1		}	,
		/*	3a	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	3b	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	3c	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	3d	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	3e	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	3f	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		
		/*	40	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	41	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	42	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	43	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	44	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	45	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	46	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	47	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	48	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	49	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	4a	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	4b	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	4c	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	4d	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	4e	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	4f	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		
		/*	50	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	51	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	52	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	53	*/	{	0	,	0x002e		,	0x002e		,	-1		,	-1		,	-1		}	,	
		/*	54	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	55	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	56	*/	{	0	,	0x005c		,	0x007c		,	0x001c	,	-1		,	-1		}	,		
		/*	57	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	58	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	59	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	5a	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	5b	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	5c	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	5d	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	5e	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	5f	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		
	};
	
	public static final int DEADKEYS[] = null;
	public static final int DEADKEY_LUT[][] = null;
	
	private static HebrewLayout instance = new HebrewLayout();
	
	private HebrewLayout() {
	}
	
	public static HebrewLayout getInstance() {
		return instance;
	}	

	@Override
	public int[][] getLUT() {
		return LUT;
	}

	@Override
	public int[][] getFastLUT() {
		return FAST_LUT;
	}

	@Override
	public void type(String text) {
		super.type(FAST_LUT, text, (byte)0);
	}	
	
	@Override
	public void type(String text, int typingSpeed) {
		super.type(FAST_LUT, text, (byte)0, typingSpeed);
	}
	
	@Override
	public void type(String text, byte modifiers) {
		super.type(FAST_LUT, text, modifiers);
	}
	
	@Override
	public void type(String text, byte modifiers, int typingSpeed) {
		super.type(FAST_LUT, text, modifiers, typingSpeed);
	}
	
	@Override
	public char getChar(int scanCode, boolean capsLock, boolean shift, boolean altGr) {
		return super.getChar(LUT, scanCode, capsLock, shift, altGr);
	}	
	
	@Override
	public String getLocaleName() {		
		return LOCALE_NAME;
	}	
	
	@Override
	public String getNativeName() {
		return LAYOUT_NAME_NATIVE; 
	}
	
	@Override
	public String getEnglishName() {
		return LAYOUT_NAME_ENGLISH;
	}
	
	@Override
	public String getVariant() {
		return LAYOUT_VARIANT;
	}
	
	@Override
	public int[][] getDeadkeyLUT() {		
		return DEADKEY_LUT;
	}

	@Override
	public int[] getDeadkeys() {
		return DEADKEYS;
	}

}
