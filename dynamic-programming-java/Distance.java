class Distance {
    static int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    static int remainingMinutesInOven(int actualMinutes) {
        return expectedMinutesInOven() - actualMinutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    static int preparationTimeInMinutes(int layers) {
        return layers*2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    static int totalTimeInMinutes(int layers, int minInOven) {
        int preparationTime = preparationTimeInMinutes(layers);
        return minInOven+preparationTime;
    }

}