(ns app.root
  (:require [app.ui :as ui]
            [com.fulcrologic.fulcro.components :as comp :refer [defsc]]
            [com.fulcrologic.fulcro-css.localized-dom :as dom]
            [com.fulcrologic.fulcro-css.css-injection :as inj]))

(defsc Root [this {:root/keys [rule]}]
  {:query         [{:root/rule (comp/get-query ui/Rule)}]
   :initial-state (fn [_] {:root/rule (comp/get-initial-state ui/Rule)})}
  (dom/div (inj/style-element {:component this})
           (ui/rule-ui rule)))