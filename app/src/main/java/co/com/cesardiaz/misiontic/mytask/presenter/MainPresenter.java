package co.com.cesardiaz.misiontic.mytask.presenter;

import java.util.List;

import co.com.cesardiaz.misiontic.mytask.model.MainInterctor;
import co.com.cesardiaz.misiontic.mytask.mvp.MainMVP;
import co.com.cesardiaz.misiontic.mytask.view.MainActivity;
import co.com.cesardiaz.misiontic.mytask.view.dto.TaskItem;

public class MainPresenter implements MainMVP.Presenter {

    private MainMVP.Model model;
    private MainMVP.View view;

    public MainPresenter(MainMVP.View view){
        this.view = view;
        this.model = new MainInterctor();
    }

    @Override
    public void loadTasks() {
        List<TaskItem> items = model.getTasks();

        view.showTaskList(items);


    }

    @Override
    public void addNewTask() {

    }
}
