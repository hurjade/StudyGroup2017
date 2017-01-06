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
 * ���׸� �迭 ���� ��� : elements=(E[]) new Object[10];

�迭 �ø��� ��: System.arraycopy(����, ����index, �纻, ����index, ����index(length�̿�))
		elements ������ �Űܳ��� �迭 ũ�� �ٽ� �����ϰ� �ٽ� elements�� �Ű� ��������.


add(E element){
	�迭 �ø��� �޼ҵ�();
	�迭 �������� elements �Է�;
}

add(int index ,E element){
	�迭 �ø��� �޼ҵ�();
	�ε��� ���� ���� �ݺ��� �̿��� �ϳ��� �迭�� �ø� size�� 1 ���� ��Ŵ();
	�迭 �������� elements �Է�;
}

remove(int index){
	null �̿�,
	�ݺ������� ���� index ����ȣ�� �ڷḦ �ϳ��� �ű�� �޼ҵ�()
}

remove(E element){
	�ε��� ã�� �޼ҵ�()	->indexOf����žߵǿ�. �� ���Ҷ� toString().equals()�� �ϼ���.
	�ε��� �� �����
	�ݺ������� ���� index ����ȣ�� �ڷḦ �ϳ��� �ű�� �޼ҵ�()
}

clear(){
	�ݺ������� �ϴ� ����鼭 size���� �ٿ��ּ���.
}

indexOf(E Value){
	�ݺ������� �ε��� ã��. ���񱳴� toString().equals()��...
	���ϰ� intŸ��
	������ -1 ����
}

*/
