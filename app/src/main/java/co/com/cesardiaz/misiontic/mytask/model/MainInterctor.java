package co.com.cesardiaz.misiontic.mytask.model;

import java.util.ArrayList;
import java.util.List;

import co.com.cesardiaz.misiontic.mytask.mvp.MainMVP;
import co.com.cesardiaz.misiontic.mytask.view.dto.TaskItem;

public class MainInterctor implements MainMVP.Model {

    private List<TaskItem> tempItems;

    public MainInterctor() {
        tempItems = new ArrayList<>();
        tempItems.add(new TaskItem("Do the shopping", "diciembre 09,2021"));
    }

    @Override
    public List<TaskItem> getTasks() {
        return tempItems;
    }

    @Override
    public void saveTask(TaskItem task) {
        tempItems.add(task);
    }
}
