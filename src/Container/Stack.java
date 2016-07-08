package Container;

import java.util.LinkedList;

/**
 * ��LinkedListʵ��ջ
 * ���к�ջ���𣺶����Ƚ��ȳ���ջ�Ƚ������
 */
public class Stack<T>
{
    private LinkedList<T> storage = new LinkedList<T>();

    /** ��ջ */
    public void push(T v)
    {
        storage.addFirst(v);
    }

    /** ��ջ������ɾ�� */
    public T peek()
    {
        return storage.getFirst();
    }

    /** ��ջ��ɾ�� */
    public T pop()
    {
        return storage.removeFirst();
    }

    /** ջ�Ƿ�Ϊ�� */
    public boolean empty()
    {
        return storage.isEmpty();
    }

    /** ���ջԪ�� */
    public String toString()
    {
        return storage.toString();
    }

    public static void main(String[] args)
    {
        Stack stack=new Stack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack.toString());
        Object obj=stack.peek();
        System.out.println(obj+"--"+stack.toString());
        obj=stack.pop();
        System.out.println(obj+"--"+stack.toString());
        System.out.println(stack.empty());
    }
}
