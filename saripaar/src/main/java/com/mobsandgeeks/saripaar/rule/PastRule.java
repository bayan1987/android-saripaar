/*
 * Copyright (C) 2014 Mobs and Geeks
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.Past;

import java.util.Date;

/**
 * @author Ragunath Jawahar <rj@mobsandgeeks.com>
 */
public class PastRule extends AnnotationRule<Past, Date> {

    protected PastRule(Past past) {
        super(past);
    }

    @Override
    public boolean isValid(Date data) {
        return false;
    }
}
