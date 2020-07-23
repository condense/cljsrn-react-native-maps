(ns interop.react-native-community.react-native-maps.v1
  (:require [react-native-maps :as module]
            [reagent.core :as r]
            [goog.object :as gobject]))

(assert module)
(assert module/default)

(def map-view (r/adapt-react-class module/default))
(def marker (r/adapt-react-class module/Marker))
(def callout (r/adapt-react-class module/Callout))
(def polygon (r/adapt-react-class module/Polygon))
(def polyline (r/adapt-react-class module/Polyline))
(def circle (r/adapt-react-class module/Circle))
(def overlay (r/adapt-react-class module/Overlay))
(def heatmap (r/adapt-react-class module/Heatmap))
(def geojson (r/adapt-react-class module/Geojson))

(defn event->coord [e]
  (let [o (gobject/getValueByKeys e "nativeEvent" "coordinate")]
    {:latitude  (gobject/get o "latitude")
     :longitude (gobject/get o "longitude")}))

(comment
  (defn app []
    [rn/view {:style {:flex 1}}
     [react-native-maps/map-view
      {:style  {:flex 1}
       :region {:latitude       -42,
                :longitude      146,
                :latitudeDelta  6,
                :longitudeDelta 6}}]]))
