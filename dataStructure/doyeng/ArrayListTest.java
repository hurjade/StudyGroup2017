package dataStructure_2017_01_07;

public class ArrayListTest {
	private int size=0;
	private Object[] data=new Object[100];
	
	// 가장 마지막 순서에 전달받은 값 추가
	public boolean add(Object value){
		data[size]=value;
		size++;
		return true;
	}
	
	// 전달받은 순서의 값 불러오기
	public Object get(int index){
		return data[index];
	}
	
	// 전달받은 순서의 값 제거 및 이후의 순서 당기기
	public Object remove(int index){
		// 메소드 종료 시에 반환될 삭제된 값 담아두기
		Object removed=data[index];
		// 삭제될 index 바로 다음부터 가장 끝 순번의 data를 대상으로 함
		for(int i=index+1; i<=size-1; i++){
			// 한칸씩 앞의 data에 덮어 씌움
			data[i-1]=data[i];
		}
		// 리스트의 크기를 줄여줌
		size--;
		// 가장 마지막 순번의 값을 null로 만들어줌
		data[size]=null;
		
		return removed;
	}
	
	// 전달받은 순서에 전달받은 값으로 덮어 씌우기
	public void set(int index, Object value){
		if(size-1>=index)
			data[index]=value;
	}
	
	// 리스트의 크기 출력
	public int size(){
		return size;
	}
	
}
