(ns app.client
  (:require
    [app.mount-point :as mount]
    [app.root :as root]
    [com.fulcrologic.fulcro.application :as app]
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [com.fulcrologic.fulcro.mutations :refer [defmutation]]
    [com.fulcrologic.fulcro.rendering.keyframe-render :as keyframe-renderer]
    [com.fulcrologic.fulcro.networking.http-remote :as fhr]))

(def options {:remotes           {:remote
                                  (fhr/fulcro-http-remote {:url "/api"})}
              :optimized-render! keyframe-renderer/render!})

(defn refresh []
  (mount/mount root/Root))

(defn ^:export start []
  (reset! mount/app (app/fulcro-app options))
  (mount/mount root/Root))

