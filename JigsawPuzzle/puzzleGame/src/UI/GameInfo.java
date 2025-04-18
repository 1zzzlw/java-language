package UI;

import java.io.Serial;
import java.io.Serializable;

public class GameInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = 4588135291174916641L;
    private int step;
    private int x = 0;
    private int y = 0;
    private String path;
    private int[][] data;


    public GameInfo() {
    }

    public GameInfo(int step, int x, int y, String path, int[][] data) {
        this.step = step;
        this.x = x;
        this.y = y;
        this.path = path;
        this.data = data;
    }

    /**
     * 获取
     * @return step
     */
    public int getStep() {
        return step;
    }

    /**
     * 设置
     * @param step
     */
    public void setStep(int step) {
        this.step = step;
    }

    /**
     * 获取
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * 设置
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * 获取
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     * 设置
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * 获取
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取
     * @return data
     */
    public int[][] getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(int[][] data) {
        this.data = data;
    }

    public String toString() {
        return "GameInfo{step = " + step + ", x = " + x + ", y = " + y + ", path = " + path + ", data = " + data + "}";
    }
}
