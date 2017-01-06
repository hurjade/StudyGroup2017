package seunghyun;

public class MyArrayList<E>{
	private E[] element;
	private int size=0;
	
	public MyArrayList(){
		element=(E[]) new Object[10];
	}
	
	public void add(E element){
		if(this.element.length<=size){
			E[] elementTmp=(E[]) new Object[this.element.length];
			System.arraycopy(this.element, 0, elementTmp, 0, this.element.length);
			
			this.element=(E[]) new Object[size+10];
			System.arraycopy(elementTmp, 0, this.element, 0, elementTmp.length);
			
			elementTmp=null;
		}
		this.element[size]=element;
		size++;
	}
	
	public E get(int index){
		return element[index];
	}
	
	public void remove(int index){
		
	}
}

//add, get, remove, set, size

/*
 * 
 * 
 * 제네릭 배열 선언 방법 : elements=(E[]) new Object[10];

배열 늘리는 법: System.arraycopy(원본, 시작index, 사본, 시작index, 종료index(length이용))
		elements 내용을 옮겨놓고 배열 크기 다시 선언하고 다시 elements에 옮겨 넣으세요.


add(E element){
	배열 늘리는 메소드();
	배열 마지막에 elements 입력;
}

add(int index ,E element){
	배열 늘리는 메소드();
	인덱스 상위 값을 반복문 이용한 하나씩 배열을 올림 size도 1 증가 시킴();
	배열 마지막에 elements 입력;
}

remove(int index){
	null 이용,
	반복문으로 지운 index 윗번호의 자료를 하나씩 옮기는 메소드()
}

remove(E element){
	인덱스 찾기 메소드()	->indexOf만드셔야되요. 값 비교할때 toString().equals()로 하세요.
	인덱스 값 지우기
	반복문으로 지운 index 윗번호의 자료를 하나씩 옮기는 메소드()
}

clear(){
	반복문으로 싹다 지우면서 size값도 줄여주세요.
}

indexOf(E Value){
	반복문으로 인덱스 찾기. 값비교는 toString().equals()로...
	리턴값 int타입
	없으면 -1 리턴
}

*/
