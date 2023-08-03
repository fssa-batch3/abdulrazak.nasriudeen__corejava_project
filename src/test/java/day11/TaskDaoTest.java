package day11;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
public class TaskDAOTest {

    @Test

    void testCreateTask() throws SQLException {
        TaskDAO taskDAO = new TaskDAO();
        Task task = new Task();
        task.id = 4;
        task.name = "Task 1";
        task.status = "Pending";
        try {
            taskDAO.createTask(task);
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }
}