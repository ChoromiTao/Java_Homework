package org.example;

public class Hometask_2_1 {
    public static void main(String[] args){
        String json_string = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Mosccow\", \"age\":\"null\"}";

        String query = "select * from students where " + getWhereSQL(json_string);
        System.out.println(query);
        String query1 = "select * from students where " + getStringFromJSON(json_string);
        System.out.println(query1);
    }

    public static String getWhereSQL(String json){
        String[] data = json.replace("{", "").replace("}", "").replace("\"", "").split(", ");

        StringBuilder sb = new StringBuilder();

        String[] data1;
        for (String datum : data){
            data1 = datum.split(":");
            sb.append(data1[0]);
            sb.append("=");
            sb.append(data1[1]);
            sb.append(", ");
        }

        sb.delete(sb.length() - 2, sb.length());

        return sb.toString();
    }

    public static String[] getStringFromJSON(String json) {
        String[] data = json.replace("[", "").replace("]", "").split("}, \\{");

        String[] data1, data2;
        String[] res = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            StringBuilder sb = new StringBuilder();

            data1 = data[i].replace("{", "").replace("}", "").replace("\"", "").split(", ");

            sb.append("Студент ");
            sb.append(data1[0].split(":")[1]);
            sb.append(" получил ");
            sb.append(data1[1].split(":")[1]);
            sb.append(" по предмету ");
            sb.append(data1[2].split(":")[1]);
            sb.append(".");

            res[i] = sb.toString();
        }
        return res;
    }
}
