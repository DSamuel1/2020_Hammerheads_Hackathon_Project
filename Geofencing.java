public class Geofencing {
    public static void main(String[] args){
        int people = 0;
        int max_people = 0;
        double fence_lon = 0;
        double fence_lat = 0;
        Latlng fencecoordinate = Latlng(fence_lat, fence_lon);
        Geofence.Builder()
        .setCircularRegion()
        .setTransitionTypes( Geofence.GEOFENCE_TRANSITION_ENTER, Geofence.GEOFENCE_TRANSITION_EXIT )
        .build();
        int geoFenceTransition = geofencingEvent.getGeofenceTransition();
        if(geoFenceTransition == Geofence.geofencingEvent.GEOFENCE_TRANSITION_ENTER){
            people = people+1;
        }
        else if(geoFenceTransition == Geofence.geofencingEvent.GEOFENCE_TRANSITION_EXIT){
            people = people-1;
        }
        if(people>=max_people){
            System.out.println("Too many people!");
        }
    }
        private GeofencingRequest createGeofenceRequest( Geofence geofence ) {
            return new GeofencingRequest.Builder()
                    .setInitialTrigger( GeofencingRequest.INITIAL_TRIGGER_ENTER )
                    .addGeofence( geofence )
                    .build();
    }

}