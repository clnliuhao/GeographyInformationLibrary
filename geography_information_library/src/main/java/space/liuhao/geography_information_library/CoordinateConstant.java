package space.liuhao.geography_information_library;

/**
 * 坐标信息常量
 *
 * @author 刘浩 2015-11-02 10:41:54
 * @version 1.0.0
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class CoordinateConstant{
    /**
     * 获取维度原点值
     *
     * @return 维度原点值
     */
    public static double getLatitudeOrigin(){
        return LATITUDE_ORIGIN;
    }

    /**
     * 获取经度原点值
     *
     * @return 经度原点值
     */
    public static double getLongitudeOrigin(){
        return LONGITUDE_ORIGIN;
    }

    /**
     * 获取最大东经值
     *
     * @return 最大东经值
     */
    public static double getMaxEastLongitude(){
        return MAX_EAST_LONGITUDE;
    }

    /**
     * 获取最大北纬值
     *
     * @return 最大北纬值
     */
    public static double getMaxNorthernLatitude(){
        return MAX_NORTHERN_LATITUDE;
    }

    /**
     * 获取最大南纬值
     *
     * @return 最大南纬值
     */
    public static double getMaxSouthLatitude(){
        return MAX_SOUTH_LATITUDE;
    }

    /**
     * 获取最大西经值
     *
     * @return 最大西经值
     */
    public static double getMaxWestLongitude(){
        return MAX_WEST_LONGITUDE;
    }
    /**
     * 最大北纬
     */
    private static final double MAX_NORTHERN_LATITUDE = 90;
    /**
     * 最大南纬
     */
    private static final double MAX_SOUTH_LATITUDE = -90;
    /**
     * 最大东经
     */
    private static final double MAX_EAST_LONGITUDE = 180;
    /**
     * 最大西经
     */
    private static final double MAX_WEST_LONGITUDE = -180;
    /**
     * 经度原点
     */
    private static final double LONGITUDE_ORIGIN = 0;
    /**
     * 维度原点
     */
    private static final double LATITUDE_ORIGIN = 0;
}