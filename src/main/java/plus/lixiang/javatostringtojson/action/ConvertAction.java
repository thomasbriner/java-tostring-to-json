package plus.lixiang.javatostringtojson.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import plus.lixiang.javatostringtojson.toolwindow.ConvertDialog;

public class ConvertAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        //  insert action logic here
        ConvertDialog dialog = new ConvertDialog();
        dialog.setTitle("java toString convert json");
        dialog.pack();
        dialog.setVisible(true);
    }
}
