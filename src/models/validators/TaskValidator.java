package models.validators;

public class TaskValidator {
    // バリデーションを実行する
    public static String validate(String content){
        String error = null;

        if (content == null || content.strip().equals("")) {
            error = "やることを入力してください";
        }
        return error;
    }
}
