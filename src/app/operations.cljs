(ns app.operations
  (:require
    [com.fulcrologic.fulcro.mutations :refer [defmutation]]))

(defmutation save-rule
  [{:keys [tempid]}]
  (action [{:keys [state]}]
          @state)
  (remote [env] true))

