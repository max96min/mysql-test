package kr.co.hongjong.todo;

import kr.co.hongjong.todo.dao.TodoDao;
import kr.co.hongjong.todo.dto.Todo;

public class test {

    public static void main(String[] args) {
        TodoDao dao = new TodoDao();
        Todo todo = dao.getTodo(1);
        System.out.println(todo);

    }

}