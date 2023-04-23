package DZ_2;

import org.apache.tapestry5.json.JSONObject;

/*
Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */
public class task_2 {
    public static void main(String[] args) {
        StringBuilder whereClause = new StringBuilder("select * from students where ");

        JSONObject filterParams = new JSONObject("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");

        for (String key : filterParams.keySet()) {
            String value = filterParams.getString(key);
            if (!value.equals("null")) {
                whereClause.append(key).append("='").append(value).append("' AND ");
            }
        }

        whereClause.delete(whereClause.length() - 5, whereClause.length());
        String sqlQuery = whereClause.toString();
        System.out.println(sqlQuery);
    }
}

