package space.liuhao.geography_information_library;

/**
 * 坐标合法性检查
 *
 * @author 刘浩 2015-11-02 11:07
 * @version 1.0.0
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public final class CoordinateValidityInspect{
    /**
     * 经度合法性检查
     *
     * @param currentLongitude 当前经度
     * @return true：合法，false：非法
     */
    public static boolean longitudeInspect(double currentLongitude){
        return (CoordinateConstant.getMaxEastLongitude() - currentLongitude > 0) && (currentLongitude - CoordinateConstant.getMaxWestLongitude() >= 0);
    }


    /**
     * 纬度合法性检查
     *
     * @param currentLatitude 当前纬度
     * @return true：合法，false：非法
     */
    public static boolean latitudeInspect(double currentLatitude){
        return (CoordinateConstant.getMaxNorthernLatitude() - currentLatitude > 0) && (currentLatitude - CoordinateConstant.getMaxSouthLatitude() > 0);
    }
}
