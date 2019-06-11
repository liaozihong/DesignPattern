package com.dashuai.learning.singletonmode.simple;

/**
 * Enum singleton
 * <p/>
 * Created in 2019.06.11
 * <p/>
 *
 * @author Liaozihong
 */
public class EnumSingleton {

    /**
     * My enum singleton
     * <p/>
     * Created in 2019.06.11
     * <p/>
     *
     * @author Liaozihong
     */
    public enum MyEnumSingleton {
        /**
         * Enum factory my enum singleton.
         */
        enumFactory;
        private EnumSingleton instance;

        private MyEnumSingleton() {
            instance = new EnumSingleton();
        }

        /**
         * Gets instance.
         *
         * @return the instance
         */
        public EnumSingleton getInstance() {
            return instance;
        }

    }

    /**
     * Gets instances.
     *
     * @return the instances
     */
    public static EnumSingleton getInstances() {
        return MyEnumSingleton.enumFactory.getInstance();
    }
}
